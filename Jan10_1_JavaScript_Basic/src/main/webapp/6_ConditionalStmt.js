/**
 * 
 */
//6. ���ǹ�
//��ġ������ ��������� �޾ƿ� true, false�� ������ �Ϸ���...
//� ���ǿ� ���� ���Ŀ� ������ �޶����� ������ִ�...

const age = 19;
if(age > 19){
	alert("�������~");
} else if(age === 19){
	alert("���� ������ �ϼ���!")
} else{
	alert("naga!");
}

//switch - case��
//	case�� �پ��� ��� ���� �����ϰ� �� �� �ִٴ� ����!
//��� : 100��
//�ٳ��� : 200��
//Ű�� : 300��
//��� : 500��
//���� : 500��
//������ ������ ����� ���� �˷��ֱ�(alert��)
const fruit = prompt("���� ����?");

switch(fruit){
	case "���" : alert(`${fruit} 100��`); break;
	case "�ٳ���" : alert("200��"); break;
	case "Ű��" : alert("300��"); break;
	case "���", "����" : alert("500��"); break;
	default : alert("���Ͼ���!"); break;
}
