<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <table class="w3-table w3-bordered w3-striped w3-border test w3-hoverable">
      <tbody>
        <tr class="w3-green">
            <th>No.</th>
            <th>제목</th>
            <th>예제</th>
      </tr>
      </tbody>
      <tbody>
      <tr>
        <td>1</td>
        <td>클릭이벤트</td>
        <td>
          <router-link to='/calculator'>계산기</router-link>
        </td>
      </tr>
      <tr>
        <td>2</td>
        <td>회원가입</td>
        <td>
          <router-link to='/joinForm'>회원가입</router-link>
        </td>
      </tr>
      <tr>
        <td>3</td>
        <td>계산기셀프</td>
        <td>
          <!-- <router-link to='/calculatorSelf'>계산기</router-link> -->
        </td>
      </tr>
      <tr>
        <td>4</td>
        <td>로그인</td>
        <td>
          <router-link to='/loginForm'>로그인</router-link>
        </td>
      </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
export default {
  name: 'Home',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
