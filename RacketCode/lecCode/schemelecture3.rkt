; remove all occurrences of atom a in the list l.  The list can contain sublists.
; (removeall 'x '((x a x x) b (x ())))  => ((a) b (()))
(define removeall*
  (lambda (a l)
    (cond
      ((null? l) '())
      ((list? (car l)) (cons (removeall* a (car l)) (removeall* a (cdr l))))
      ((eq? (car l) a) (removeall* a (cdr l)))
      (else (cons (car l) (removeall* a (cdr l)))))))

; test to see if two lists are equal in contents and structure
; (eq-list* '(a (v)) '(a (v)))  =>  #t
; (eq-list* '((a) v) '(a (v)))  => #f
(define eq-list*
  (lambda (l1 l2)
    (cond
      ((null? l1) (null? l2))
      ((null? l2) #f)
      ((and (list? (car l1)) (list? (car l2))) (and (eq-list* (car l1) (car l2))
                                                    (eq-list* (cdr l1) (cdr l2))))
      ((or (list? (car l1)) (list? (car l2))) #f)
      (else (and (eq? (car l1) (car l2)) (eq-list* (cdr l1) (cdr l2)))))))
      
; is an atom a member of a list?  The list can contain sublists
(define member*?
  (lambda (a l)
    (cond
      ((null? l) #f)
      ((pair? (car l)) (or (member*? a (car l)) (member*? a (cdr l))))
      ((eq? a (car l)) #t)
      (else (member*? a (cdr l))))))

; sum all the numbers in a list of lists
(define sumnumbers*
  (lambda (l)
    (cond
      ((null? l) 0)
      ((number? (car l)) (+ (car l) (sumnumbers* (cdr l))))
      ((pair? (car l)) (+ (sumnumbers* (car l)) (sumnumbers* (cdr l))))
      (else (sumnumbers* (cdr l))))))

; remove all atoms (not the empty list) from a list of lists
(define emptyall
  (lambda (l)
    (cond
      ((null? l) '())
      ((list? (car l)) (cons (emptyall (car l)) (emptyall (cdr l))))
      (else (emptyall (cdr l))))))

; convert a list of lists into a single list of atoms
; (flatten '((a) ((b) c d) e (f ((g h)))))  => (a b c d e f g h)
(define flatten
  (lambda (l)
    (cond
      ((null? l) '())
      ((list? (car l)) (append (flatten (car l)) (flatten (cdr l))))
      (else (cons (car l) (flatten (cdr l)))))))