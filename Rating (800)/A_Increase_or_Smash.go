package main

import (
	"fmt"
	"sort"
)

func main () {
	var testCase int;
	fmt.Scan(&testCase);

	for i:=0; i < testCase; i++ {
		var arrayLength int;
		fmt.Scan(&arrayLength)
		count := 1

		arr := make([]int, arrayLength)

		for j:=0; j<arrayLength; j++ {
			fmt.Scan(&arr[j])
		}

		sort.Ints(arr)

		for j:=1; j<arrayLength; j++ {
			if arr[j] != arr[j-1] {
				count++
			}
		}
		sum := (2*count) - 1
		fmt.Println(sum)
	}
}