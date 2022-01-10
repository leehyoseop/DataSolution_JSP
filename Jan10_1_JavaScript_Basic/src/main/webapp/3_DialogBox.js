//3. 대화상자
//	alert, prompt, confirm
//	alert : 알려줌(일방적인 경고창)

//	prompt : 입력받음(값을 입력받을 때)
const name = prompt("이름을 입력하세요.");
alert(name + "님 환영합니다.");

alert(`안녕하세요 ${name}님. 환영합니다!`);
//prompt 창을 취소하면 ... -> null(아무 내용도 없다)

//prompt값은 default값도 넣을 수가 있음 
//뭔가에 대한 값을 넣을 때 안내하거나 힌트를 주는 역할이 가능

const reservation = prompt("예약일을 입력해주세요", "2022-01-");

//confirm : 확인 받음 
//confirm창에서 '확인' -> true / '취소' -> false
const isAdult = confirm("당신은 성인입니까");
alert(isAdult);

alert("무야호!"); //메세지를 보여주는 기능
prompt("점심메뉴?"); //메세지를 보여주고, 어떤 값을 입력받게 해주는 기능
confirm("JS shwoa?") //사용자에게 확인을 받기 위한 기능

//단점
//1.창이 떠있는 동안 스크립트가 일시 정지됨
//2.스타일링 불가능(위치 / 모양을 정할수가 없음)
// + 브라우저마다 모양이 다 제각각 다름
//이런 단점을 가지고서라도 빠르고 간단하게 적용
