(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))


(deftest is-divisible-by-three
	(testing "returns true for 3")
		(is (= true (divisible-by-three? 3))))

(deftest is-divisible-by-three
	(testing "returns false for 1")
		(is (= false (divisible-by-three? 1))))