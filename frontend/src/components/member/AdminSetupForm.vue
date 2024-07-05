<script setup>
import {ref, defineEmits} from "vue";

const emits = defineEmits(['register-admin']);
const userId = ref('')
const userPw = ref('')
const userName = ref('')

const fireRegisterAdmin = () => {
  emits('register-admin', {
    userId: userId.value,
    userPw: userPw.value,
    userName: userName.value
  })
}
</script>

<template>
  <form @submit.prevent="fireRegisterAdmin">
    <table>
      <tr>
        <td>아이디</td>
        <td><input type="text" v-model="userId"></td>
      </tr>
      <tr>
        <td>비밀번호</td>
        <td><input type="text" v-model="userPw"></td>
      </tr>
      <tr>
        <td>관리자명</td>
        <td><input type="text" v-model="userName"></td>
      </tr>
      <tr>
        <td colspan="2"><button>로그인</button></td>
      </tr>
    </table>
  </form>
</template>

<style scoped>

</style>