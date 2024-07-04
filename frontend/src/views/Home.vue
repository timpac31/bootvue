<script setup>
const getTime = () => {
  return new Date().toString()
}
</script>

<template>
  <div>
    <h1>Image Shop에 오신것을 환영합니다.</h1>
    <p>{{getTime()}}</p>
  </div>
</template>
