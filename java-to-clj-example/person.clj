(ns kaunas-jug.example.person
  (:import [jug.kaunas Person PersonBuilder]))

(defn person-1 []
  (new Person "Test1" "Last" 25 ["Swimming" "Skiing"]))

(defn person-2 []
  (-> (PersonBuilder/builder)
      (.withName "Test2" "Last")
      (.withAge 28)
      (.withHobby "Swimming")
      (.withHobby "Karate")
      (.withHobby "Wrestling")
      (.build)))

(defn -main []
  (let [p1 (person-1)
        p2 (person-2)]
    (println "Hello!")
    (.printHobbies p1)
    (.printHobbies p2)))
