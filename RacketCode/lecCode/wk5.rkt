# lang

;(sumnumber-acc '(1 a b 2 d 3) 0) = 6
(define sumnumber-acc
  (lambda (l acc)
    (cond
      ((null? l) acc)
      ((number? (car l)) (sumnumber-acc (cdr l) (* (car l) acc)))
      (else (sumnumber-acc (cdr l) acc)))))

; factorial with continuation passing style
(define fact-cps
  (lambda (n return)
    (if (zero? n)
        (return 1)
        (fact-cps (- n 1) (lambda (v) (return (* v n)))))))

;(myappend-acc '(a b c) '(w x y z) ???) == '(a b c x y z)
(define myappend-cps
  (lambda (l1 l2 return)
    (if (null? l2)
        (return l1)
        (myappend (cdr l1) l2 (lambda (v) (return (cons (car l1) v)) break)))))