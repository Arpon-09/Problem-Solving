package main
import "fmt"

func swapNum (a int, b int)(int , int) {
	var c int

	c = a
	a = b 
	b = c
	return a , b


}

func main () {
	var firstNum, secondNum int 

	fmt.Scanln(&firstNum, &secondNum)
	
	firstNum , secondNum = swapNum(firstNum, secondNum)
	fmt.Println(firstNum , secondNum)



}