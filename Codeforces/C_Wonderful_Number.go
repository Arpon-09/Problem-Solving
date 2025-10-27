package main

import (
	"fmt"
	"strconv"
)

func tellme(num int) bool {
	// Check if number is odd
	if num%2 == 0 {
		return false
	}

	// Convert number to binary string
	binary := strconv.FormatInt(int64(num), 2)

	// Check if binary string is palindrome
	n := len(binary)
	for i := 0; i < n/2; i++ {
		if binary[i] != binary[n-1-i] {
			return false
		}
	}

	return true
}

func main() {
	var n int
	
	fmt.Scanln(&n)

	if tellme(n) {
		fmt.Println("YES")
	} else {
		fmt.Println("NO")
	}
}
