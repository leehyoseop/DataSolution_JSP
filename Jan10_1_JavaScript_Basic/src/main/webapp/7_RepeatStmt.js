/**
 * 
 */
//7.반복문(Java와 동일)
//동일한 작업을 여러번 반복할때 사용
// for / while / do-while 
// 1~10까지 로그 찍기
let i;
for(i = 1; i<=10; i++){
	console.log(i);
}
let j = 1;
while(j!=11){
	//j = 1; 
	console.log(j);
	j++;
}
let k=1;
do{
	console.log(k);
	k++;
}while(k!=11)
//반복문 깨기
//break;
//continue; 멈추고 다음 반복으로 넘어가서 진행
//return : 비공식 -> 메소드를 빠져나가면서 반복문도 자동적으로 종료

while(true){
	let answer = confirm("계속?");
	if(!answer){
		break;	
	}
}
