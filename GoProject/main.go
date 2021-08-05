package main

import (
	"bufio"
	"log"
	"os"
	"strconv"
	"strings"
)

func main() {

	// os.Open() opens specific file in
	// read-only mode and this return
	// a pointer of type os.
	file, err := os.Open("numbers.txt")

	if err != nil {
		log.Fatalf("failed to open")

	}

	file2 , err1 := os.Create("lineAverage.txt")

	if err1 != nil {
		log.Fatal(err1)
	}

	file3 , err2 := os.Create("allNumberAverage.txt")

	if err2 != nil {
		log.Fatal(err2)
	}

	scanner := bufio.NewScanner(file)
	scanner.Split(bufio.ScanLines)
	var text []string

	for scanner.Scan() {
		text = append(text, scanner.Text())
	}

	file.Close()


	allNumberAverage := 0
	allNumberCount := 0
	for lineNum, eachLn := range text {

		arr := strings.Fields(eachLn)
		lineAverage := 0
		numberCountInLine := 0

		for _, number := range arr {
			numberCountInLine++
			i, _ := strconv.Atoi(number)
			lineAverage += i
			allNumberCount++
		}
		allNumberAverage += lineAverage
		lineAverage /= numberCountInLine

		if err1 == nil && lineNum == 0 {
			file2.WriteString(strconv.Itoa(lineAverage))
		}else if err1 == nil{
			file2.WriteString("\n" + strconv.Itoa(lineAverage))
		}
	}
	allNumberAverage /= allNumberCount
	if err2 == nil {
		file3.WriteString(strconv.Itoa(allNumberAverage))
	}
	file2.Close()
	file3.Close()
}