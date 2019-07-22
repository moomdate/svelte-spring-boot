<script>
  let rando;
  let myName = "";
  function setRando() {
    rando = Math.random();
  }
  function pushBook(BookName) {}
  //let promise = getRandomNumber();

 

  function handleClick() {
   // promise = getRandomNumber();
  }
</script>

<style>
  button {
    background: #575757;
    color: #ffffff;
    border: 0px;
    width: 60px;
  }
  button:active {
    background: #3d3d3d;
  }
  h3 {
    color: #d521e6;
  }
</style>

<center>
  <h3>To do book {myName}</h3>
  <input type="text" bind:value={myName} />
  <button>Add</button>
</center>
