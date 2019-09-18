(ns kaunas-jug.example.person
  (:require [clojure.data.csv :as csv]
            [clojure.java.io :as io]
            [clj-time.core :as t]
            [clj-time.format :as f]
            [clj-time.local :as l])
  (:import [jug.kaunas Person]))

(defn read-data [fpath]
  (let [reader (io/reader fpath)
        [header & body] (csv/read-csv reader)]
    body))

(defn parse-person
  [[fname lname date-of-birth hobbies]]
  (let [age (-> (f/parse (f/formatter "MM/dd/yyyy") date-of-birth)
                (t/interval (l/local-now))
                (t/in-years))]
    (new Person fname lname age (clojure.string/split hobbies #";"))))

(defn read-persons [fpath]
  (map parse-person
       (read-data fpath)))
