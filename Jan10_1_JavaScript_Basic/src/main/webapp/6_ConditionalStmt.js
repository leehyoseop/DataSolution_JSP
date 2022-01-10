/**
 * 
 */
//6. 조건문
//일치연산자 결과값으로 받아온 true, false로 뭔가를 하려고...
//어떤 조건에 따라서 이후에 실행이 달라지게 만들어주는...

const age = 19;
if(age > 19){
	alert("어서오세요~");
} else if(age === 19){
	alert("공부 열심히 하세요!")
} else{
	alert("naga!");
}

//switch - case문
//	case가 다양할 경우 보다 간결하게 쓸 수 있다는 장점!
//사과 : 100원
//바나나 : 200원
//키위 : 300원
//멜론 : 500원
//수박 : 500원
//사고싶은 과일을 물어보고 가격 알려주기(alert로)
const fruit = prompt("무슨 과일?");

switch(fruit){
	case "사과" : alert(`${fruit} 100원`); break;
	case "바나나" : alert("200원"); break;
	case "키위" : alert("300원"); break;
	case "멜론", "수박" : alert("500원"); break;
	default : alert("과일없음!"); break;
}
