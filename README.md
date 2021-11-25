# competition
Đề bài
Cho một số nguyên N. Bạn phải tìm số bộ 4 số nguyên phân biệt (A, B, C, D) thỏa mãn hai điều kiện sau:
1 <= A, B, C, D <= N
A * B = C * D
Hai bộ số nguyên (A, B, C, D) và (E, F, G, H) được gọi là phân biệt nếu thỏa mãn một trong những điều kiện sau
A # E
B # F
C # G
D # H

Đầu vào
Dòng đầu tiên chứa T là số test case
T dòng tiếp theo mỗi dòng chứa một số nguyên biểu diễn N
Đầu ra
Với mỗi testcase, in ra một dòng thể hiện số bộ số thỏa mãn điều kiện đề bài

Ràng buộc
1 < T < 10
1 < N < 10^6

Yêu cầu:
Mã nguồn phải có phần đọc input từ file: input.txt
Output được ghi vào file output.txt

Ví dụ:
Input
3
3
50
35

Output
15
10950
4831

Giải thích:
Với test case 1, N = 3 thì chúng ta có thể tìm được 15 bộ số thỏa mãn yêu cầu đề bài như sau:

(1, 1, 1, 1)
(1, 2, 2, 1)
(1, 3, 3, 1)
(2, 1, 1, 2)
(2, 2, 2, 2)
(2, 3, 3, 2)
(3, 1, 1, 3)
(3, 2, 2, 3)
(3, 3, 3, 3)
(1, 2, 1, 2)
(2, 1, 2, 1)
(1, 3, 1, 3)
(3, 1, 3, 1)
(2, 3, 2, 3)
(3, 2, 3, 2)
