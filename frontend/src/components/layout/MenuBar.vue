<script setup>

</script>

<template>
  <div class="menu-bar">
    <table>
      <tr>
        <td><router-link :to="{name: 'Home'}">Home</router-link></td>
        <td><router-link :to="{name: 'AdminSetupView'}">관리자등록</router-link></td>
      </tr>
    </table>
  </div>
</template>

<style scoped>
  .menu-bar { border-top: 1px solid #ccc; border-bottom: 1px solid #ccc; margin-bottom:10px; }
  table td {border-right: 1px solid #ccc;}
</style>