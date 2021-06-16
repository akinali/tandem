<template>
  <div>
    <div class="card mb-3 mt-3" >
      <div class="row" style="    padding: 20px;">
                <h4>My Profile..</h4>

        <div class="col-6">
          <div class="row">
            <div class="col-3">
              <legend> Name </legend>
            </div>
            :
            <div class="col-8">
              <legend>{{ user.name }}</legend>
            </div>
          </div>
        </div>
        <div class="col-6">
          <div class="row">
            <div class="col-3">
              <legend> Surname </legend>
            </div>
            :
            <div class="col-8">
              <legend>{{ user.surname }}</legend>
            </div>
          </div>
        </div>
          <div class="col-6">
                      <div class="row">

            <div class="col-3">
              <legend> Email </legend>
            </div>
            :
            <div class="col-8">
              <legend>{{ user.email }}</legend>
            </div>
          </div>
        </div>
        <div class="col-6">
          <div class="row">
            <div class="col-3">
              <legend> Creation Date </legend>
            </div>
            :
            <div class="col-8">
              <legend>{{ user.created }}</legend>
            </div>
          </div>
        </div>
        <div class="col-6">
          <div class="row">
            <div class="col-3">
              <legend> Want To Learn Language </legend>
            </div>
            :
            <div class="col-8">
              <legend>{{ user.wantToLearnLanguage }}</legend>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  name: "AboutMe",
  props: {
    user: Object,
  },
};
</script>
<style scoped>
.row{
    margin-top:1,5rem;
    margin-bottom:1rem;
    text-align:left;
}
</style>
