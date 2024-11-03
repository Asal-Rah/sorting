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

def quicksort(startnum , endnum , array): 
    if (startnum < endnum): 
        a = partthenums(startnum , endnum , array) 
        quicksort(startnum, a - 1, array) 
        quicksort(a + 1, endnum , array) 

#aval n , k ra vurudi migirim  
answer = 0 
length = list(map(int,input().split()))
#list ar ra az karbar vurudi migirim  
ar = list(map(int,input().split()))
# hala be estefade az quick sort ar ra sort miknonim  
quicksort(0,length[0] - 1,ar) 
# ye integer baraye jam kardan adadha dar nazar migirim 
#va ba estefade az halgheye for adadha ra jam mikonim 
for i in range(length[0] - length[1]) :
  answer += ar[i]

print(answer)