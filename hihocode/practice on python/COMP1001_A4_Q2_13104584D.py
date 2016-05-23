def main():
	
	a = input("please enter a symbol: ")
	b = eval(input("please enter a positive position of the symbol on the first line: "))
	c = b*2 -1
	m1 = 1
	m2 = c
	m3 = c
		
	for i in range(b):
		
		for e in range(m2):
			print (" ", end="")
			e = e + 1;
			
		for f in range (m1):
			print (a, end="")
			f = f + 1
			
		for g in range(m3):
			print (" ", end="")
			g = g + 1;
			
		print()
		i = i - 1
		m1 = m1 + 2
		m2 = m2 - 1
		m3 = m3 - 1

main()