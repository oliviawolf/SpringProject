


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

function openPage(evt, pageName){
	var i, tabcontent, tablinks;
	
	//hide all elements in tabcontent class
	tabcontent= document.getElementsByClassName('tabcontent');
	for(i=0; i< tabcontent.length; i++){
		tabcontent[i].style.display = 'none'
	}
	//get elements in tablinks and remove the active class
	
	tablinks = document.getElementsByClassName('tablinks');
	for(i=0;i<tablinks.length;i++){
		tablinks[i].className = tablinks[i].className.replace(" active", "");
		
	}
	
	//show current tab and add active class to the button that opened the tab
	
	document.getElementById(pageName).style.display = 'block';
	evt.currentTarget.className +=" active";
	
}
function addImage(){
	var imageLink = prompt('please enter a link');
	x=document.getElementById('new');
	x.setAttribute('src',imageLink);
	x.style.visibility='visible';
	
}

function playSong(){
	var song=document.getElementById('sound');

	song.play();
}

function pauseSong(){
	var song=document.getElementById('sound');
	song.pause();
}

function chooseSong(link){
	var song=document.querySelector('source');
	
	location.replace('olivia2.html');
	
}