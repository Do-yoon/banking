import React from "react";
import { urls, baseurl } from '../util/Constants';
import axios from "axios";

const validate = {
	signin: (form) => {
		console.log(baseurl + urls.signin);
		console.log(form);
		axios.post(baseurl + urls.signin, form)
			.then((response) => {
				console.log(response.data);
				if (response.data.loginStatus === 0) {
					console.log(true);
					return true;
				} else {
					alert("noooooo");
					return false;
				}
			})
			.catch(() => {
				return false;
			})
	}
}

export default validate;