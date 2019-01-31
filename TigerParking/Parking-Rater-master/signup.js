const form = document.querySelector('#signup-attempt');

form.addEventListener('submit', (e) => {
		e.preventDefault();
		
		db.collection('User').add({
			email: form.email.value,
			signup_date: new Date(),
			total_ratings: 0
	});
	
})

