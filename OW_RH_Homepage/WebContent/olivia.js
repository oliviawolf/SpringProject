var Button = document.getElementById('Hello There');

Button.onclick = function(){
	alert('You did it!!');
}

function myFunction(){
	alert('hello');
}

function myFunction2(){
	x=document.getElementById('baby');
	if(x.style.visibility==='hidden'){
		x.style.visibility='visible';	
	}
	else{
		x.style.visibility='hidden';
	}
	
}//