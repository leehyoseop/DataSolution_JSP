/**
 * aaaa
 */
//4. �� ��ȯ

// String(��) -> ���������� ��ȯ
// Number(��) -> ���������� ��ȯ
// Boolean(��) -> �������� ��ȯ

// �� ��ȯ�� ��? �ʿ��ұ��?!
//	 �ڷ����� �ٸ� �� ������ ��������� ���ϴ� ����� ������ ���� ���� �ֱ� ������!

// ���� , ���� ������ �Է¹޾Ƽ� ����� ���ϴ� ���α׷�
const Math = prompt("���������� �Է��� �ּ���");
const English = prompt("���������� �Է��� �ּ���");

//prompt�� ���� ���� ������!!! '������'
//�׷��� "80" + "90" = 170(x), "8090"(o)
//������ 8090�ε� ����� ����!
//�������� �ƴϴ��� ǥ������ ���������� �ڵ����� ��ȯ�Ǿ ����

//�ڵ�����ȯ�� ���ƺ��ϼ��� ������...
//������ ã�� ���� ������ �߻���ų����!!
//�� ��ȯ�� �Ҷ��� �׻� �ǵ��� ������ ���ϴ� Ÿ������ ��ȯ���ִ� ���� ����!
//'����� �� ��ȯ'�̶�� ��

//String() : S�� �翬�� �빮�� -> ��ȣ�ȿ� �ִ� ���� ���������� �ٲ���!
const math = 80;
const english = 100;
const average = (math + english)/2;
alert(average);
alert((Number(Math)+Number(English))/2);
alert((Number(Math + English))/2);

console.log(
	String(3), 
	String(true),
	String(false),
	String(null),
	String(undefined)		
);

//Number() : N�� ���ó� �빮��! -> ��ȣ�ȿ� �ִ� ���� ���������� �ٲ���

console.log(
	Number("1234"),
	Number("asdf"),
	Number(true),
	Number(false)
);

//Boolean() : B�� �빮�ڷ� �Է� -> ��ȣ �ȿ� �ִ� ���� �������� �ٲ���
//false
//	-���� 0 / �� ���ڿ�("") / null / undefined / NaN
//�̿ܿ��� ��� true���� ��

console.log(
	Boolean(0),
	Boolean(""),
	Boolean(null),
	Boolean(undefined),
	Boolean(NaN)
);

//���� ���� -> �̰Ŵ� ���� ������ �� ���...
Number(null)	//0
Number(undefined)	//NaN
const a = Number(prompt("aaaa"));	//Ȯ�� Ȥ�� ��� -> �ƹ��� ���� ���� �ʾƼ� Null

Boolean(0);	//false
Boolean('0'); //true
Boolean(''); //false
Boolean(" "); //true



