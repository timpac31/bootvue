<script setup>
import {ref, defineEmits} from "vue";

const userId = ref('')
const password = ref('')
const emit = defineEmits(['sign-in'])

const fireSignin = () => {
  emit('sign-in', { userId: userId.value, password: password.value })
}
</script>

<template>
  <form @submit.prevent="fireSignin">
    <table>
      <tr>
        <td>아이디</td>
        <td><input type="text" v-model="userId"></td>
      </tr>
      <tr>
        <td>비밀번호</td>
        <td><input type="text" v-model="password"></td>
      </tr>
      <tr>
        <td colspan="2"><button>로그인</button></td>
      </tr>
    </table>
  </form>
</template>
