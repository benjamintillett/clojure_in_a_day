(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))


(deftest three-is-divisible-by-three
	(testing "returns true for 3")
		(is (= true (divisible-by-three? 3))))

(deftest one-is-not-divisible-by-three
	(testing "returns false for 1")
		(is (= false (divisible-by-three? 1))))

(deftest five-is-divisible-by-five
	(testing "returns true for 5")
		(is (= true (divisible-by-five? 5))))

(deftest one-is-not-divisible-by-five
	(testing "returns false for 1")
		(is (= false (divisible-by-five? 1))))

(deftest fifteen-is-divisible-by-fifteen
	(testing "returns true for 15")
		(is (= true (divisible-by-fifteen? 15))))

(deftest twelve-is-not-divisible-by-fifteen
	(testing "returns false for 12")
		(is (= false (divisible-by-fifteen? 12))))

(deftest game-returns-Fizz-if-divisble-by-three 
	(testing "returns Fizz for 3")
		(is (= "Fizz" (game 3))))

(deftest game-returns-Buzz-if-divisble-by-five 
	(testing "returns Buzz for 5")
		(is (= "Buzz" (game 5))))

(deftest game-returns-FizzBuzz-if-divisble-by-fifteen
	(testing "returns FizzBuzz for 15")
		(is (= "FizzBuzz" (game 15))))

(deftest game-returns-number-if-not-divisible-by-fife-or-three
	(testing "returns 13 for 13")
		(is (= 13 (game 13))))