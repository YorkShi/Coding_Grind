#lang racket

; len: takes a list and returns the length of the list
(define len
  (lambda (lis)
    (if (null? lis)
        0
        (+ 1 (len (cdr lis))))))

; member? takes an element (that is an atom) and a list and returns true if the element
;           is in the list
(define member?
  (lambda (a lis)
    (cond 
      ((null? lis) #f)
      ((eq? a (car lis)) #t)
      (else (member? a (cdr lis))))))

; factorial of a number
(define factorial
  (lambda (n)
    (if (zero? n)
        1
        (* n (factorial (- n 1))))))

; countnum: counts the number of occurrences of an atom in a list
(define countnum
  (lambda (a lis)
    (cond
      ((null? lis) 0)
      ((eq? a (car lis)) (+ 1 (countnum a (cdr lis))))
      (else (countnum a (cdr lis))))))

; sumnumbers: sum all the numbers in a list
(define sumnumbers
  (lambda (lis)
    (cond
      ((null? lis) 0)
      ((number? (car lis)) (+ (car lis) (sumnumbers (cdr lis))))
      (else (sumnumbers (cdr lis))))))