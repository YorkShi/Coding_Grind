def main():

	str1 = input("Please input a string of characters:")
	q = len(str1)
	y = list(str1)
	
	for i in range(q):
		if y[i].isupper():
			y[i] = y[i].lower()
		else:
			y[i] = y[i].upper()
		i = i + 1
	str2 = ''.join(y)
	print(str2)

main()
 	
 	