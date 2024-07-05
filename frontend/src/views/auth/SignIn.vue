<script setup>
import SignInForm from '@components/auth/SignInForm.vue'

const signIn = payload => {
  console.log(payload)
  //TODO 회원가입
}
</script>

<template>
  <div>
    <h2>로그인</h2>
    <sign-in-form @sign-in="signIn"/>
  </div>
</template>
