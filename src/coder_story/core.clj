(ns coder-story.core)




(def strings {3 "Foo" 5 "Bar" 7 "Qix"})

(defn convert-each-number
  "Convert Each Number"
  [number]
  (case number
    \3 "Foo"
    \5 "Bar"
    \7 "Qix"
    nil
    )
 )

(defn convert
  "Convert"
  [number]
  (apply str (map convert-each-number (str number)))
)


(defn div
  "Div Function"
  [diviseur]
  (
     fn [number] (if (= 0 (mod number diviseur)) (strings diviseur) nil)
  )
)

(def foo (div 3))
(def bar (div 5))
(def qix (div 7))



(defn foobarqix 
  "Foo Bar Qix" 
  [number]
  (let [x (str (foo number) (bar number) (qix number))
        y (convert number)
        result (str x y)] 
        (if (empty? result) number result)      
   )
)





  

