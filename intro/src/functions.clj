(ns functions)

(let [x 20
      y 21]
  (+ x y))

(defn messenger 
  ([] (messenger "Hello World!"))
  ([msg] (println msg)))

(messenger)

(messenger "Hello class!")
