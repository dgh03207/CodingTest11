
# Python_study for codingtest
    This is python concept that i found while studying coding test

| Date | Problem | Concept |
| :---: | :---: | :---: |
| 5/20 | [수식 최대화](Programmers/2020_카카오_인턴십/수식_최대화.py) | [정규 표현식](# regular-expression) |



# regular-expression

출처 : [학습 링크]('https://wikidocs.net/4308')


## 정규 표현식

### 메타 문자(meta-characters)


| 개념 | 설명 | 기타 |
| :---: | :---: | :---: |
| 문자 클래스 [] | []사이의 문자들과 매치 | [abc] == a,b,c중 하나의 문자와 매치 |
| -(하이폰) | 두 문자 사이의 범위 | [a-c] == [abc] == a부터 c까지|
| ^ | not의 의미 | [^0-9] == 숫자를 제외한 문자만 매치됨 |
| .(Dot) | 줄바꿈 문자인 '\n'을 제외한 모든 문자와 매치 | [a.b] == a와 b사이에 어떤 문자가 오면 매치(빈칸x) |


#### <자주 사용하는 문자 클래스>

| 개념 | 설명 | 
| :---: | :---: |
| \d | 숫자와 매치 |
| \D | 숫자가 아닌 것과 매치 |
| \s | whitespace문자와 매치 |
| \S | whitespace문자가 아닌 것과 매치 |
| \w | 숫자+문자와 매치 |
| \W | 숫자+문자가 아닌 것과 매치 |


#### <반복>

| 개념 | 설명 | 기타 |
| :---: | :---: | :---: |
| * | 최소 0번 이상 반복 | ca*t 면 ct도 매치함 |
| + | 최소 1번 이상 반복 | ca+t 면 ct는 매치하지 않음|
| ({m,n}?) | 반복 횟수 m부터 n까지(m또는 n 생략가능) | {2,3} == 2부터 3까지 반복횟수 매치 |
| ? | 있어도 매칭, 없어도 매칭 | ca?t == ct도 매칭 cat도 매칭 |


### re.compile()

#### <문자열 검색>

p = re.compile([a-z]+)

| 개념 | 설명 | 기타 |
| :---: | :---: | :---: |
| match() | 문자열이 처음부터 정규식과 매치되는지 조사 | p.match('python') => python이 매칭됨 |
| search() | 문자열 전체를 검색해서 매치되는지 조사 | p.search('3python') 3을 제외한  python만 매칭 |
| findall() | 매치되는 모든 문자열(substring)을 리스트로 돌려준다 | p.findall('life is too short') == ['life','is','too','short'] |
| finditer() | 매치되는 모든 문자열을 반복 가능한 객체로 돌려준다. | for문사용 가능한 객체로 돌려줌 |


#### <메타문자>

| 개념 | 설명 | 기타 |
| :---: | :---: | :---: |
| | | or과 동일한 의미 | ca*t 면 ct도 매치함 |
| ^ | 문자열의 맨 처음과 일치함 | re.MULTILINE 사용시, 여러 줄의 문자열의 각 줄에 적용 가능 |
| $ | ^ 메타 문자와 반대의 경우 | $는 문자열의 끝과 매치함 |
|  |