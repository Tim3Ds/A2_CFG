Test String results for each section of Part B

Part_B_1
// A CFG for alphabet {a,b} that recognizes the language consisting of 
// all strings that start with an odd number of a's followed by the 
// same number of b's. 
// Test your program with the following input strings:
//		ab, aabb, aaabbb, aaabbbbb, aaaabbb
CFG
	S=>aaSbb
	S=>ab
output:
run:
  Accept String?  true
  Accept String?  false
  Accept String?  true
  Accept String?  false
  Accept String?  false
BUILD SUCCESSFUL (total time: 0 seconds)

Part_B_2
// A CFG for alphabet {a,b} that recognizes the language consisting of 
// all strings of length 1 or greater that do not contain the substring 
// aa.  
// Test your program with the following input strings:
//		abba, abbabaaa, abaabab, bababbab, bbbabba
CFG
	S=>bS
    S=>abS
	S=>a
	S=>b
	S=>ab
run:
  Accept String?  true
  Accept String?  false
  Accept String?  false
  Accept String?  true
  Accept String?  true
BUILD SUCCESSFUL (total time: 0 seconds)

Part_B_3
// A CFG for alphabet {a,b} that recognizes the language consisting of 
// all strings that contain exactly one b, have 2N a's 
// (N >= 0, N is an integer) before the b, and 2N+1 a's after the b. 
// Test your program with the following input strings:
//		ba, aaabaaaa, aabaaa, abaa, aaaabaaa
CFG
	S=>Ta
	T=>aTa
	T=>b
run:
  Accept String?  true
  Accept String?  true
  Accept String?  true
  Accept String?  true
  Accept String?  false
BUILD SUCCESSFUL (total time: 0 seconds)

Part_B_4
// A CFG for alphabet {x,y,z} that recognizes the language consisting of
// all strings that start with z, followed by N x's (N >= 0), followed 
// by twice as many y's, and ending with z. 
// Test your program with the following input strings:
//		zz, zxxyyz, zxxyyyy, zxyyz, zxxyyyyz
CFG
	S=>zTz
	T=>xTyy
	T=>
run:
  Accept String?  true
  Accept String?  false
  Accept String?  false
  Accept String?  true
  Accept String?  true
BUILD SUCCESSFUL (total time: 0 seconds)