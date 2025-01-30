document.addEventListener('DOMContentLoaded', fetchMessages);

async function fetchMessages(){
	
	const apiUrl='http://localhost:8080/getMessages';
	try{
	const response=await fetch(apiUrl);
	if(!response.ok){
		throw new Error(`HTTP Error status: ${response.status}`);
	}
	
	const messages=await response.json();
	populateTable(messages);
}catch(error){
	console.error(`error fetching messages`,error);
	alert(`failed to fetch messages`);
}}

function populateTable(messages){
	const tableBody=document.querySelector('#messages-table tbody');
	tableBody.innerHTML='';
	
	messages.forEach(message=>{
		
		const row=document.createElement('tr');
		row.innerHTML=`
		<td>${message.name}</td>
		<td>${message.mobile}</td>
		<td>${message.message}</td>

		
		`;
		tableBody.appendChild(row)
	});
	
}
//document.getElementById('fetch-messages-btn').addEventListener('click', fetchMessages);
