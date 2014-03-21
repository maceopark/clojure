(ns functions)

(let [x 20
      y 21]
  (+ x y))

(defn messenger 
  ([] (messenger "Hello World!"))
  ([msg] (println msg)))

(messenger)

(messenger "Hello class!")

(defn fac
  "Returns the factorian of n, which must be a positive integer"
  [n]
  (if (= n 1)
    1
    (* n (fac(- n 1)))))

(fac 5)

(* 3 (+ 1 2 3) 4 5 6)