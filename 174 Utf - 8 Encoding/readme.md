1. You are given an array of integers.
2. You are required to test whether the array represents a valid sequence of UTF-8 characters or 
     not.
3. A character in UTF-8 can be from 1 to 4 bytes long and follows some rules - 
       (i)  For 1-byte long character, first bit will be 0 and rest represents its unicode code.
       (ii) For n-bytes long character, first n-bits will be 1's, the n+1th bit is 0, followed by n-1 bytes 
             with most significant 2 bits being 10.

Note -> Only the least significant 8 bits of each element in array is used for data.
Note -> Check out the question video for details.

