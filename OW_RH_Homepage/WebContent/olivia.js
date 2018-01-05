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

function addImage(){
	var imageLink = prompt('please enter a link');
	x=document.getElementById('new');
	x.setAttribute('src',imageLink);
	x.style.visibility='visible';
	
}