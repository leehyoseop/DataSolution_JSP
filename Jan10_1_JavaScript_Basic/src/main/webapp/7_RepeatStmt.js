/**
 * 
 */
//7.�ݺ���(Java�� ����)
//������ �۾��� ������ �ݺ��Ҷ� ���
// for / while / do-while 
// 1~10���� �α� ���
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
//�ݺ��� ����
//break;
//continue; ���߰� ���� �ݺ����� �Ѿ�� ����
//return : ����� -> �޼ҵ带 ���������鼭 �ݺ����� �ڵ������� ����

while(true){
	let answer = confirm("���?");
	if(!answer){
		break;	
	}
}
