(ns kaunas-jug.example
  (:require [clj-http.client :as http))

 
(def fetch-jug-page
  []
  (http/get "http://www.kaunas-jug.lt/"))
