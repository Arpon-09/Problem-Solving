package main

import "fmt"

func chkPrime (number int) bool {

	if number <= 1 {
		return  false
	}
	for i:= 2; i*i<=number; i++ {
		if (number % i == 0) {
			return false
		}
	}
	 return true
}

func main() {
	var testCase int
	fmt.Scanln(&testCase)
	
	for i:=0; i<testCase; i++ {
		var num int
		fmt.Scanln(&num)
		 result := chkPrime(num)
		if (result){
			fmt.Println("YES")
		} else {
			fmt.Println("NO")
		}
	}

}
