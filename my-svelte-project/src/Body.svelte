<script>
  let waitBook = getBookList();
  async function getBookList() {
    const res = await fetch(`http://localhost:1234/book/all`);
    const text = await res.json();

    if (res.ok) {
      return text;
    } else {
      // error
      throw new Error(text);
    }
  }
  function listHandle(data) {
    console.log(data);
    return data;
  }
  async function del(id){
      let cc = req_del(id.srcElement.id);
      waitBook = getBookList();
  }
  async function req_del(id){
      const res = await fetch(`http://localhost:1234/book/del/${id}`);
      return res;
  }
</script>

<style>
  div {
    background: rgb(192, 62, 192);
    overflow: hidden;
    width: 620px ;
    margin-bottom: 10px;
  }

  div h3 {
    text-align: center;
    display: inline-block;
    width: 620px;
    
  }

  div button {
    float: right;
  }
</style>

{#await waitBook}
  <p>...waiting</p>
{:then number}
  {#each listHandle(number) as { id, name }, i}
    <div>
      <h3>#{id} {name} </h3>
      <button type="button" on:click={del} id="{id}">Delete</button>
    </div>
  {/each}
{:catch error}
  <p style="color: red">{error.message}</p>
{/await}
