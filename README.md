# AddStringPOJO


1. 입력 Class구현
2. 구분자 Enum에 상수로 저장
3. Enum에 저장한 Separator를 SumSeparatorList에 List형태로 저장
4. 입력 문자열에 공백 있는지 검증
5. 입력 문자열에 customSeparator 개행문자가 존재하는지 검증
6. 입력 문자열에 customSeparator null이 아닌지 검증
7. 입력 문자열에 customSeparator 숫자가 아닌지 검증
8. customSeparator 존재할 때 SumSeparatorList에 추가
9. SeparatorSumCalculate에서 SumSeparatorList에서 구분자 하나씩 꺼내서 입력 문자열에 존재하는 구분자를 공백으로 대체 후 문자열 배열로 저장
10. SeparatorSumCalculate에서 sumCalculate()메소드를 통해 문자열 배열을 Int형으로 변환 후 sum으로 더하고 저장
