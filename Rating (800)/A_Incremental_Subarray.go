package main
import "fmt"

func main () {
	var x int
	fmt.Scanln(&x)

	for i:=0; i<x; i++ {
		var n, m int
		fmt.Scanln(&n)
		fmt.Scanln(&m)

		sum := (n-m) +1
		fmt.Println(sum)

	}
}