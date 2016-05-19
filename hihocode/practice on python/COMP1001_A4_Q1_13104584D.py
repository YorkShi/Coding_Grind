def main():
	a = input("please enter your first name: ")
	b = input("please enter your last name: ")
	c = eval(input("please enter the width of the text box: "))
	d = eval(input("please enter the height of the text box: "))
	
	str1 = a + " "+ b + " "
	str2 = (str1 * ((c//len(str1))+1))[:c]
	print (str2)
    
	for i in range(d-1):
		e = str2[:1]
		str2 = str2[1:]
		str2 = str2 + e
		print (str2)
main()