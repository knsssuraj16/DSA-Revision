1. You are given an array(arr) of N numbers.
2. You have to select three indices i,j,k following this condition -> 
      0 <= i < j <= k < arr.length
3. Two numbers X and Y as defined as :
      X = arr[i] ^ arr[i+1] ^ ... ^ arr[j - 1]
      Y = arr[j] ^ arr[j+1] ^ ... ^ arr[k]
4. You have to print the number of triplets where X is equal to Y.

