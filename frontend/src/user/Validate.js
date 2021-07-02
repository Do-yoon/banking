import React from "react";
import { urls, baseurl } from '../util/Constants';
import axios from "axios";

const validate = {
	signin: (form) => {
		console.log(baseurl + urls.signin);
		return axios.post(baseurl + urls.signin, form)
			.then((response) => {
				console.log(response.data.loginStatus)
				if (response.data.loginStatus === 0) {
					return new Promise(resolve => resolve("do-yoon"/*response.data.userName*/));
				} else {
					return new Promise((resolve, reject) => reject("invalid"));
				}
			})
			.catch(() => {
				return new Promise((resolve, reject) => reject("server error"));
			})
	}
}

export default validate;