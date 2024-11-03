def partthenums(startnum, endnum , arr): 
    num = startnum 
    number = arr[num] 
    while startnum < endnum : 
        while startnum < len(arr) and arr[startnum] <= number: 
            startnum += 1 
        while arr[endnum] > number: 
            endnum -= 1 
        if (startnum < endnum): 
            arr[startnum], arr[endnum] = arr[endnum], arr[startnum] 
    arr[endnum], arr[num] = arr[num], arr[endnum] 
    return endnum 

def quicksort(startnum , endnum , arr1 , arr2): 
    if (startnum < endnum): 
        a = partthenums(startnum , endnum , arr2) 
        quicksort(startnum, a - 1, arr1 , arr2) 
        quicksort(a + 1, endnum , arr1 , arr2) 



n = int(input())
arr= (input()).split()
ar = (input()).split()


quicksort(0,n-1,arr,ar)
quicksort(0,n-1,ar,arr)

#hala print mikonim 
print(*arr , sep = " ")
print(*ar , sep = " ")
