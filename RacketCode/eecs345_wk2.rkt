#lang racket
(define nmethod
  (lambda (a b)
    (- a (/ (- (* a a) b) (* a 2)))))

(define squareroot
  (lambda (a b c)
    (cond
      ((null? b) a)
      (else (squareroot (nmethod a c) (- b 1) c)))))

