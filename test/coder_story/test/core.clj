(ns coder-story.test.core
  (:use [coder-story.core])
  (:use [clojure.test])
  (:use midje.sweet)
)

(deftest foobarqix-test
  (fact (foobarqix 1) => 1)
  (fact (foobarqix 2) => 2)
  (fact (foobarqix 3) => "FooFoo")
  (fact (foobarqix 4) =>  4)
  (fact (foobarqix 5) => "BarBar")
  (fact (foobarqix 6) => "Foo")
  (fact (foobarqix 7) => "QixQix")
  (fact (foobarqix 21) => "FooQix")
  (fact (foobarqix 15) => "FooBarBar")
  (fact (foobarqix 33) => "FooFooFoo")
  (fact (foobarqix 51) => "FooBar")
)

(deftest convert-number-test
  (fact (convert 1) => "")
  (fact (convert 2) => "")
  (fact (convert 3) => "Foo")
  (fact (convert 5) => "Bar")
  (fact (convert 7) => "Qix")
  (fact (convert 13) => "Foo")
)



; Si le nombre est divisible par 3 ou contient 3, écrire “Foo” à la place de 3.
; Si le nombre est divisible par 5 ou contient 5, écrire “Bar” à la place de 5.
; Si le nombre est divisible par 7 ou contient 7, écrire “Qix” à la place de 7
; 1
; 2
; FooFoo
; 4
; BarBar
; Foo
; QixQix
; 8
; Foo
; Bar


