<template>
    <v-card outlined>
        <v-card-title>
            UpdateMember
        </v-card-title>

        <v-card-text>
            <Email offline label="Email" v-model="value.email" :editMode="editMode" @change="change"/>
            <Address offline label="Address" v-model="value.address" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="updateMember"
            >
                UpdateMember
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'UpdateMemberCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.email = {};
            this.value.address = {};
        },
        watch: {
        },
        methods: {
            updateMember() {
                this.$emit('updateMember', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

