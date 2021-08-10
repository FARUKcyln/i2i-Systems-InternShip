package main

import (
	"fmt"
	"time"
)
func duplicateInArray(arr []int){
	duplicateValue := false
	var duplicateList []int
	visited := make(map[int]bool, 0)
	for i:=0; i<len(arr); i++{
		if visited[arr[i]] == true{
			duplicateValue = true
			duplicateList = append(duplicateList, arr[i])
		} else {
			visited[arr[i]] = true
		}
	}
	if !duplicateValue {
		fmt.Println("YOK")
	}else {
		fmt.Println(duplicateList)
	}
}

func main(){
	start := time.Now()
	duplicateInArray([]int{1,2,4,8,3})
	execution := time.Since(start)
	fmt.Println("Execution Time : " ,execution)

	start = time.Now()
	duplicateInArray([]int{4,6,12,5,5,89})
	execution = time.Since(start)
	fmt.Println("Execution Time : " ,execution)

	start = time.Now()
	duplicateInArray([]int{4,3,8,8,35,35,12})
	execution = time.Since(start)
	fmt.Println("Execution Time : " ,execution)

	start = time.Now()
	duplicateInArray([]int{5,6,78,5})
	execution = time.Since(start)
	fmt.Println("Execution Time : " ,execution)
}
