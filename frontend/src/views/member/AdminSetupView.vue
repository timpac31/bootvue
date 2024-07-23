<script setup>
import AdminSetupForm from "@components/member/AdminSetupForm.vue";
import axios from "../../modules/client.js";
import {router} from "@router/router.js";

const registerAdmin = payload => {
  const {userId, userPw, userName} = payload
  axios.post('/members/setup', {userId, userPw, userName})
    .then(res => {
      alert('등록되었습니다.')
      router.push({name: 'Home'})
    }).catch(err => console.log(err.message))
}
</script>

<template>
  <div>
    <admin-setup-form @register-admin="registerAdmin"/>
  </div>
</template>
