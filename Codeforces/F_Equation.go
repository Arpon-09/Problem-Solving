package main

import "fmt" 

func calculatePower (x int, n int) int {
	result := 1

	for i:=0; i<n; i++ {
		result = result * x
	}
	return result
}


func calculateEquation (x int, n int) int {
	sum := 0;

	for i:=0; i<=n; i++ {
		if i == 0 {
			sum = sum + calculatePower(x, 0)-1
		} else if i%2==0 {
			sum = sum + calculatePower(x , i)
		}
	}
	return sum
}

func main () {
	var x , n int 
	fmt.Scanln(&x, &n)
	result := calculateEquation(x, n)
	fmt.Println(result)
}